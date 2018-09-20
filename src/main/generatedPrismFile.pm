dtmc

//generated plan: deleteL1Server
//my plan: deleteL1Server

const int evalTime = 200;

rewards

[metric] true: evalTime * (-20 * responseTime + -20 * cost + 20 * contentQuality - 0.02 * clockTime);
[deleteL1Server1] true: 120 * (-20 * responseTime + -20 * cost + 20 * contentQuality - 0.02 * clockTime);

endrewards

module AutomaticEvalutation


clockTime: [0..999999] init 0;
currentState: [0..99] init 2;
responseTime: [1..999] init 20;
cost: [1..999] init 30;
serverCount: [1..54] init 5;
contentQuality: [1..2] init 2;

[metric] currentState= 0 -> (currentState'=currentState+1);
[final] currentState = 1 -> true;
[deleteL1Server1] currentState = 2-> 0.9:(currentState' = 0)&(clockTime'=clockTime+120)&(responseTime'= responseTime+5)&(cost'=cost-15)&(serverCount'= serverCount-1)&(contentQuality'=contentQuality)+ 0.1:(currentState' = 0)&(clockTime'=clockTime+120)&(responseTime'= responseTime)&(cost'=cost)&(serverCount'= serverCount)&(contentQuality'=contentQuality);

endmodule

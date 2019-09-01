/*
#include <iostream>
#include <vector>
#include <stack>
using namespace std;

struct Node{
    int val;
    int start;
    int end;
};

int main()
{
    std::ios::sync_with_stdio(false);
    int n;
    while(cin>>n){

        */
/********************************输入******************************//*

        vector<Node> v(n);
        vector<long long> inc(n,0);//递增序列，方便计算一段区间的累加和
        inc[-1]=0;//为了计算第一个数字的前序（应对v[i].start-1为-1的情况）
        for(int i=0;i<n;++i){
            cin>>v[i].val;
            inc[i]= i==0 ? v[i].val : inc[i-1]+v[i].val;
            v[i].start=i;
            v[i].end=i;
        }
        */
/*******************处理得到每个元素的左边界(正向遍历)*****************//*

        stack<int> s;
        int i=0;
        while(i<(int)v.size()){
            if(s.empty() || v[i].val > v[s.top()].val){
                s.push(i);
                ++i;
            }
            else{
                //插入的值更小的时候，将其start置为将要弹出的元素的start
                v[i].start=v[s.top()].start;
                s.pop();
            }
        }
        */
/*******************处理得到每个元素的右边界(反向遍历)*****************//*

        while(!s.empty())//清空s,准备反向遍历
            s.pop();
        i=n-1;
        while(i>=0){
            if(s.empty() || v[i].val > v[s.top()].val){
                s.push(i);
                --i;
            }
            else{
                //插入的值更小的时候，将其start置为将要弹出的元素的start
                v[i].end=v[s.top()].end;
                s.pop();
            }
        }
//        for(int i=0;i<n;++i){
//            cout<<"("<<v[i].val<<","<<v[i].start<<","<<v[i].end<<")"<<endl;
//        }
//        for(int i=0;i<n;++i){
//            cout<<inc[i]<<endl;
//        }
        */
/******************得到每个元素的结果，返回最大值即可*****************//*

        long long result=0;
        int index_start=0,index_end=0;//得到最大值的区间(这里是从0开始计数的)
        for(int i=0;i<n;++i){
            long long cur_result=v[i].val*(inc[v[i].end]-inc[v[i].start-1]);
            if(cur_result>result){
                result=cur_result;
                index_start=v[i].start;
                index_end=v[i].end;
            }
        }
        cout<<result<<"\n";
        cout<<index_start+1<<" "<<index_end+1<<"\n";//输出区间标记的时候从1开始计数，更直观
    }
    return 0;
}*/

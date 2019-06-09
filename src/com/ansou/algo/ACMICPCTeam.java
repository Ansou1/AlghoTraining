package com.ansou.algo;

public class ACMICPCTeam {

    static int[] acmTeam(String[] topic) {
        int[] result = new int[2]; // Skills 0 | nbr team 1

        for (int i = 0; i < topic.length; i++) {
            for (int j = i + 1; j < topic.length; j++) {
                String member1 = topic[i];
                String member2 = topic[j];
                int skillSet = 0;

                for(int k = 0; k < topic[0].length(); k++)
                {
                    if(member1.charAt(k) == '1' || member2.charAt(k) == '1')
                    {
                        skillSet++;
                    }
                }

                result[1] += (result[0] == skillSet) ? 1 : 0;

                if(skillSet > result[0])
                {
                    result[1] = 1;
                    result[0] = skillSet;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String  [] topic = {"10101", "11100", "11010", "00101"};
        acmTeam(topic);
    }
}

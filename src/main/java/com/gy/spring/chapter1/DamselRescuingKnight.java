package com.gy.spring.chapter1;

public class DamselRescuingKnight implements Knight {

    private  Quest quest;
    public DamselRescuingKnight(Quest quest)
    {
        this.quest = quest;
    }
    public void embarkOnQuest() {
        quest.embark();
    }
}

package com.kodilla;

interface Quest {
    void process();
}
class DeadIslandQuest implements Quest {
    public void process() {
        System.out.println("Super");
    }
}
class EliteKnightQuest implements Quest {
    public void process() {
        System.out.println("Extra");
    }
}
class Knight {
    private Quest quest;
    public Knight(Quest quest) {
        this.quest = quest;
    }
    public void present() {
        this.quest.process();
        System.out.println("Quest is over " + quest);
    }
}
class QuestApplication {
    public static void main(String args[]) {
        Quest deadIslandQuest = new DeadIslandQuest();
        Knight knight = new Knight(deadIslandQuest);
        knight.present();
    }
}
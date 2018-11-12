public class LivingThing {
    String name;
    int hitpoint;
    int attack;
    boolean dead;

    public LivingThing(String name, int hitpoint, int attack){
        this.name = name;
        this.hitpoint = hitpoint;
        this.attack = attack;
        dead = false;
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, hitpoint, attack);
    }

    public boolean isDead(){
        return dead;
    }


    public void setDead(boolean dead){
        this.dead = dead;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getHitpoint(){
        return hitpoint;
    }

    public void setHitpoint(int hitpoint) {
        this.hitpoint = hitpoint;
    }

    public int getAttack(){
        return attack;
    }

    public void setAttack(int attack){
        this.attack = attack;
    }

    public void attack(LivingThing livingThing){
        int damage = (int) (Math.random() * attack);
        if(dead == false ) {
            System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, livingThing.getName(), damage);
            livingThing.wounded(damage);
        }
    }



    public void wounded(int damage){
            hitPoint -= damage;
            if( hitPoint < 0 ) {
                dead = true;
                System.out.printf("%sは倒れた。\n", name);
            }
    }

}


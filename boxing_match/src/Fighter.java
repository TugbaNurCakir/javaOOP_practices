class Fighter {
    String name;
    int damage;
    int health;
    int weight;

    Fighter(String name, int damage, int health, int weight){
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
    }
    int hit(Fighter foe){ //foe; hasarı alacak dövüşçü anlamındadır.
        System.out.println(this.name + "=> "+foe.name+" 'ye "+ this.damage+" 'luk "+" hasar vurdu.");
        if(foe.health-this.damage<0){
            return 0;
        }
        return foe.health-this.damage;
    }
}


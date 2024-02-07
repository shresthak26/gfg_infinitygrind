int d,r=0,c=x;
        while(x!=0 && x>0)
        {
            d=x%10;
            r=r*10+d;
            x=x/10;
        }
        if(r==c)
        return true;
        else 
        return false;
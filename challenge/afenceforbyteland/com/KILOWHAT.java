package afenceforbyteland.com;

//Copied from another person 

import java.util.*;
import java.io.*;
 
class Polygon {
    @SuppressWarnings("unused")
	public static void main(String... args) {
         InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        OutputWriter outt = new OutputWriter(outputStream);
        int n=in.readInt(); 
        int avg_x=0,avg_y=0;
        Class1[] list = new Class1[n];int max_y=-2013;int min_y=2013;int ff=0;boolean flag[]=new boolean[n];int min=999999;int max=0;
        for(int i=0;i<n;i++){
            int a=in.readInt();int b=in.readInt();int zz=in.readInt(); flag[i]=true;
           if(zz==1000)
            {
                 max_y=Math.max(b,max_y);
                 max=Math.max(a,max);
                //else flag[i]=false;
                ff=a;}
                if(zz==1000)
           { min_y=Math.min(min_y,b);min=Math.min(min,a);}
            list[i]=new Class1(a,b,zz);
            //
        }
        for(int i=0;i<n;i++){
            if(list[i].data==1024&&(list[i].y>max_y||list[i].y<min_y||list[i].x>max||list[i].x<min)){flag[i]=false;continue;}
            avg_x+=list[i].x;avg_y+=list[i].y;
           
        }
        
        avg_x=avg_x/n;
        avg_y=avg_y/n;
        int c1=0,c2=0;
        for(int i=0;i<n;i++){
        if(list[i].y<=avg_y&&flag[i]) c1++;
        if(list[i].y>avg_y&&flag[i]) c2++;
        }
        Class1 case1[]=new Class1[c1];
        Class1 case2[]=new Class1[c2];
        boolean flag1[]=new boolean[c1];
        boolean flag2[]=new boolean[c2];
        int oo=0,pp=0;
        for(int i=0;i<n;i++){
            if(list[i].y<=avg_y&&flag[i]) {flag1[oo]=true;case1[oo++]=new Class1(list[i].x,list[i].y,list[i].data);}
            if(list[i].y>avg_y&&flag[i]) {flag2[pp]=true;case2[pp++]=new Class1(list[i].x,list[i].y,list[i].data);}
        }
 
        Arrays.sort(case1, new Comparator<Class1>() {
            public int compare(Class1 o1, Class1 o2) {
                return o1.x > o2.x ? -1 : o1.x == o2.x ? 0 : 1;
            }
        });
        for(int i=0;i<c1;){
            int j=i;
            while(++i<c1&&case1[i-1].x==case1[i].x){
            
            }
            Arrays.sort(case1,j,Math.min(i,c1), new Comparator<Class1>() {
            public int compare(Class1 o1, Class1 o2) {
                return o1.y > o2.y ? -1 : o1.y == o2.y ? 0 : 1;
            }
        });
        j=i;if(j<c1&&case1[j-1].y>case1[j].y) continue;
            while(++i<c1-1&&case1[i-1].x==case1[i].x){
            
            }
            Arrays.sort(case1,j,Math.min(i,c1), new Comparator<Class1>() {
            public int compare(Class1 o1, Class1 o2) {
                return o1.y < o2.y ? -1 : o1.y == o2.y ? 0 : 1;
            }
        });
        
            
        }
       
        //Class1 j=list[0];Class1 d=list[n-1];
        int f=c1-1;
        while(--f>=0&&case1[f+1].x==case1[f].x)
        {}
        Arrays.sort(case1,Math.min(f+1,c1-1),c1, new Comparator<Class1>() {
            public int compare(Class1 o1, Class1 o2) {
                return o1.y < o2.y ? -1 : o1.y == o2.y ? 0 : 1;
            }
        });
        Arrays.sort(case2, new Comparator<Class1>() {
            public int compare(Class1 o1, Class1 o2) {
                return o1.x < o2.x ? -1 : o1.x == o2.x ? 0 : 1;
            }
        });
        for(int i=0;i<c2;){
            int j=i;
            while(++i<c2&&case2[i-1].x==case2[i].x){
            
            }
            Arrays.sort(case2,j,Math.min(i,c2), new Comparator<Class1>() {
            public int compare(Class1 o1, Class1 o2) {
                return o1.y > o2.y ? -1 : o1.y == o2.y ? 0 : 1;
            }
        });
        j=i;if(j<c2&&case2[j-1].y>case2[j].y) continue;
            while(++i<c2-1&&case2[i-1].x==case2[i].x){
            
            }
            Arrays.sort(case2,j,Math.min(i,c2), new Comparator<Class1>() {
            public int compare(Class1 o1, Class1 o2) {
                return o1.y < o2.y ? -1 : o1.y == o2.y ? 0 : 1;
            }
        });
        
            
        }
       
        //Class1 j=list[0];Class1 d=list[n-1];
      /*  f=c2-1;
        while(--f>=0&&case1[f+1].x==case2[f].x)
        {}
        Arrays.sort(case2,Math.min(f+1,c2-1),c2, new Comparator<Class1>() {
            public int compare(Class1 o1, Class1 o2) {
                return o1.y > o2.y ? -1 : o1.y == o2.y ? 0 : 1;
            }
        });*/
        /*to edit from here*/
       int x_min=Math.max(case1[0].x,case2[case2.length-1].x);int x_max=Math.min(case1[case1.length-1].x,case2[0].x);
            for(int i=0;i<c1-2;){ 
            if(++i<c1-2&&(case1[i].data==1000)&&flag1[i-1]&&flag1[i]&&flag1[i+1]&&(((case1[i-1].y<case1[i].y)&&(case1[i+1].y<=case1[i].y))||(case1[i-1].y<=case1[i].y&&case1[i+1].y<case1[i].y))){flag1[i]=false;}
            
            }
             for(int i=0;i<c1-2;){ 
            if((++i)<c1-2&&(case1[i].data==1024)&&flag1[i-1]&&flag1[i]&&flag1[i+1]&&(((case1[i-1].y>=case1[i].y)&&(case1[i+1].y>case1[i].y))||((case1[i-1].y>case1[i].y)&&(case1[i+1].y>=case1[i].y)))){flag1[i]=false;}
            
            }int j=0;int k=0;
            for(int i=0;i<c1-2;){ 
                if(!flag1[i+1]) j=i+2;
                else j=i+1;
                if(!flag1[j+1]) k=j+2;
                else k=j+1;
            if(k<c1-2&&(case1[j].data==1000)&&flag1[i]&&flag1[j]&&flag1[k]&&(((case1[i].y<case1[j].y)&&(case1[k].y<=case1[j].y))||(case1[i].y<=case1[j].y&&case1[k].y<case1[j].y))){
                if(!(case1[(i+j)/2].data==1024||case1[(j+k)/2].data==1024))flag1[j]=false;}
                i=j;
            }
             j=0;k=0;
            for(int i=0;i<c1-2;){ 
                if(!flag1[i+1]) j=i+2;
                else j=i+1;
                if(!flag1[j+1]) k=j+2;
                else k=j+1;
            if(k<c1-2&&(case1[j].data==1024)&&flag1[i]&&flag1[j]&&flag1[k]&&(((case1[i].y>=case1[j].y)&&(case1[k].y>case1[j].y))||(case1[i].y>case1[j].y&&case1[k].y>=case1[j].y))){
                if(!(case1[(i+j)/2].data==1000||case1[(j+k)/2].data==1000))flag1[j]=false;}
                i=j;
            }
            j=0;k=0;
             for(int i=0;i<c1-2;){
                 if(!flag1[i+1]) j=i+2;
                else j=i+1;
                if(!flag1[j+1]) k=j+2;
                else k=j+1;
                if(k<c1-2&&(case1[j].data==1000)&&flag1[i]&&flag1[j]&&flag1[k]){
                double m1=slope(case1[j].x,case1[j].y,case1[k].x,case1[k].y);double m2=slope(case1[j].x,case1[j].y,case1[i].x,case1[i].y);
            if((m1>m2&&m2<999999.0&&m1<9999)){
                 if(!(case1[(i+j)/2].data==1024||case1[(j+k)/2].data==1024))
                {flag1[j]=false;}
            }}
            i=j;
            }
            j=0;k=0;
             for(int i=0;i<c1-2;){
                  if(!flag1[i+1]) j=i+2;
                else j=i+1;
                if(!flag1[j+1]) k=j+2;
                else k=j+1;
                 if(k<c1-2&&(case1[j].data==1024)&&flag1[i]&&flag1[j]&&flag1[k]){
                 double m1=slope(case1[j].x,case1[j].y,case1[k].x,case1[k].y);double m2=slope(case1[j].x,case1[j].y,case1[i].x,case1[i].y);
            if(m1<m2&&m1<999999.0&&m2<9999){
                if(!(case1[(i+j)/2].data==1000||case1[(j+k)/2].data==1000))
                flag1[j]=false;}}
            i=j;
            }
            /*edit from here*/
             for(int i=0;i<c2-2;){ 
            if(++i<c2-2&&(case2[i].data==1024)&&flag2[i-1]&&flag2[i]&&flag2[i+1]&&(((case2[i-1].y<case2[i].y)&&(case2[i+1].y<=case2[i].y))||(case2[i-1].y<=case2[i].y&&case2[i+1].y<case2[i].y))){flag2[i]=false;}
            
            }
             for(int i=0;i<c2-2;){ 
            if((++i)<c2-2&&(case2[i].data==1000)&&flag2[i-1]&&flag2[i]&&flag2[i+1]&&(((case2[i-1].y>=case2[i].y)&&(case2[i+1].y>case2[i].y))||((case2[i-1].y>case2[i].y)&&(case2[i+1].y>=case2[i].y)))){flag2[i]=false;}
            
            } j=0; k=0;
            for(int i=0;i<c2-2;){ 
                if(!flag2[i+1]) j=i+2;
                else j=i+1;
                if(!flag2[j+1]) k=j+2;
                else k=j+1;
            if(k<c2-2&&(case2[j].data==1024)&&flag2[i]&&flag2[j]&&flag2[k]&&(((case2[i].y<case2[j].y)&&(case2[k].y<=case2[j].y))||(case2[i].y<=case2[j].y&&case2[k].y<case2[j].y))){
                if(!(case2[(i+j)/2].data==1000||case2[(j+k)/2].data==1000))flag2[j]=false;}
                i=j;
            }
             j=0;k=0;
            for(int i=0;i<c2-2;){ 
                if(!flag2[i+1]) j=i+2;
                else j=i+1;
                if(!flag2[j+1]) k=j+2;
                else k=j+1;
            if(k<c2-2&&(case2[j].data==1000)&&flag2[i]&&flag2[j]&&flag2[k]&&(((case2[i].y>=case2[j].y)&&(case2[k].y>case2[j].y))||(case2[i].y>case2[j].y&&case2[k].y>=case2[j].y))){
                if(!(case2[(i+j)/2].data==1024||case2[(j+k)/2].data==1024))flag2[j]=false;}
                i=j;
            }
          /* j=0;k=0;
             for(int i=0;i<c2-2;){
                 if(!flag2[i+1]) j=i+2;
                else j=i+1;
                if(!flag2[j+1]) k=j+2;
                else k=j+1;
                if(k<c2-2&&(case2[j].data==1000)&&flag2[i]&&flag2[j]&&flag2[k]){
                double m1=slope(case2[j].x,case2[j].y,case2[k].x,case2[k].y);double m2=slope(case2[j].x,case2[j].y,case2[i].x,case2[i].y);
            if((m1>m2&&m2<999999.0&&m1<9999)){
                 if(!(case2[(i+j)/2].data==1024||case2[(j+k)/2].data==1024))
                {flag2[j]=false;}
            }}
            i=j;
            }*/
            j=0;k=0;
             for(int i=0;i<c2-2;){
                  if(!flag2[i+1]) j=i+2;
                else j=i+1;
                if(!flag2[j+1]) k=j+2;
                else k=j+1;
                 if(k<c2-2&&(case2[j].data==1024)&&flag2[i]&&flag2[j]&&flag2[k]){
                 double m1=slope(case2[j].x,case2[j].y,case2[k].x,case2[k].y);double m2=slope(case2[j].x,case2[j].y,case2[i].x,case2[i].y);
            if(m1<m2&&m1<999999.0&&m2<9999){
                if(!(case2[(i+j)/2].data==1000||case2[(j+k)/2].data==1000))
                flag2[j]=false;}}
            i=j;
            }
            int p1=0;
            for(int i=0;i<c1;i++){if(flag1[i]){ p1++;}}
             int p2=0;
            for(int i=0;i<c2;i++){if(flag2[i]){ p1++;}}//max_y=Math.max(max_y,list[i].y);min_y=Math.min(min_y,list[i].y);}}
       //  int x_min=list[0].x;int x_max=list[n-1].x;
        StringBuilder out=new StringBuilder();
        max_y=max_y+1;
        int h=p1+p2+2;
        min_y=min_y-1;
        out.append(h+"\n");
        //if(Math.abs(max_y)>Math.abs(min_y)){}
        //double dist1=distance(x_min+1,max_y,list[0].x,list[0].y)+distance(x_max-1,max_y,list[n-1].x,list[n-1].y);
        // double dist2=distance(x_min+1,min_y,list[0].x,list[0].y)+distance(x_max-1,min_y,list[n-1].x,list[n-1].y);
       // if(dist1<dist2)
        // out.append((x_min)+" "+max_y+"\n");
         //else out.append((x_min+1)+" "+min_y+"\n");
        out.append(x_min+1+" "+(avg_y)+"\n");
        
        for(int i=0;i<c1;i++){
            //Class1 g=list[i];
           if(flag1[i]) {out.append(case1[i].x+" "+case1[i].y+"\n");}}
           //if(dist1<dist2) 
           //out.append(x_max+" "+max_y+"\n");
           //else
           //out.append(x_max-1+" "+min_y+"\n");
           out.append(x_max-1+" "+(avg_y)+"\n");
           for(int i=0;i<c2;i++){
            if(flag2[i]){out.append(case2[i].x+" "+case2[i].y+"\n");}
            }
            outt.printLine(out);
outt.close();
      
    }
    
    static double distance(int x1,int y1,int x2,int y2){
        return (Math.sqrt(Math.pow((y1-y2),2)+Math.pow((x1-x2),2)));
    }
       static double slope(int x1,int y1,int x2,int y2 ){
        if(x2==x1) return 9999999.0;
        else return((double)(y2-y1)/(double)(x2-x1));
    }
    
}
class Class1 {
   
    int x;
    int y;
    int data;
    public Class1(int a,int b,int d) {
       this.x = a;
       this.y = b;
      this.data = d;
    }
 
}
 
class InputReader {
    
    private InputStream stream;
    private byte[] buf = new byte[1024];
    private int curChar;
    private int numChars;
    private SpaceCharFilter filter;
 
    public InputReader(InputStream stream) {
        this.stream = stream;
    }
 
    public int read() {
        if (numChars == -1)
            throw new InputMismatchException();
        if (curChar >= numChars) {
            curChar = 0;
            try {
                numChars = stream.read(buf);
            } catch (IOException e) {
                throw new InputMismatchException();
            }
            if (numChars <= 0)
                return -1;
        }
        return buf[curChar++];
    }
 
    public int readInt() {
        int c = read();
        while (isSpaceChar(c))
            c = read();
        int sgn = 1;
        if (c == '-') {
            sgn = -1;
            c = read();
        }
        int res = 0;
        do {
            if (c < '0' || c > '9')
                throw new InputMismatchException();
            res *= 10;
            res += c - '0';
            c = read();
        } while (!isSpaceChar(c));
        return res * sgn;
    }
 
    public String readString() {
        int c = read();
        while (isSpaceChar(c))
            c = read();
        StringBuffer res = new StringBuffer();
        do {
            res.appendCodePoint(c);
            c = read();
        } while (!isSpaceChar(c));
        return res.toString();
    }
 
    public boolean isSpaceChar(int c) {
        if (filter != null)
            return filter.isSpaceChar(c);
        return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
    }
 
    public String next() {
        return readString();
    }
 
    public interface SpaceCharFilter {
        public boolean isSpaceChar(int ch);
    }
}
 
class OutputWriter {
    private final PrintWriter writer;
 
    public OutputWriter(OutputStream outputStream) {
        writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream)));
    }
 
    public OutputWriter(Writer writer) {
        this.writer = new PrintWriter(writer);
    }
 
    public void print(Object...objects) {
        for (int i = 0; i < objects.length; i++) {
            if (i != 0)
                writer.print(' ');
            writer.print(objects[i]);
        }
    }
 
    public void printLine(Object...objects) {
        print(objects);
        writer.println();
    }
 
    public void close() {
        writer.close();
    }
 
	}        
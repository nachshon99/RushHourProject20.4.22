import java.awt.*;
public class Board{
    public final static int LINE_THICKNESS=12;
    public final static int BOARD_START_X=75;
    public final static int BOARD_START_Y=30;
    public final static int BOARD_WIDTH_HEIGHT=720;
    public final int LINE_DISTANCE=120;

    private final CustomRectangle boardBase =new CustomRectangle(BOARD_START_X,BOARD_START_Y,BOARD_WIDTH_HEIGHT,BOARD_WIDTH_HEIGHT, Color.LIGHT_GRAY);

    private final CustomRectangle line1=new CustomRectangle(BOARD_START_X,BOARD_START_Y,BOARD_WIDTH_HEIGHT,LINE_THICKNESS,Color.gray);
    private final CustomRectangle line2=new CustomRectangle(BOARD_START_X,BOARD_START_Y+LINE_DISTANCE,BOARD_WIDTH_HEIGHT,LINE_THICKNESS,Color.gray);
    private final CustomRectangle line3=new CustomRectangle(BOARD_START_X,BOARD_START_Y+2*LINE_DISTANCE,BOARD_WIDTH_HEIGHT,LINE_THICKNESS,Color.gray);
    private final CustomRectangle line4=new CustomRectangle(BOARD_START_X,BOARD_START_Y+3*LINE_DISTANCE,BOARD_WIDTH_HEIGHT,LINE_THICKNESS,Color.gray);
    private final CustomRectangle line5=new CustomRectangle(BOARD_START_X,BOARD_START_Y+4*LINE_DISTANCE,BOARD_WIDTH_HEIGHT,LINE_THICKNESS,Color.gray);
    private final CustomRectangle line6=new CustomRectangle(BOARD_START_X,BOARD_START_Y+5*LINE_DISTANCE,BOARD_WIDTH_HEIGHT,LINE_THICKNESS,Color.gray);
    private final CustomRectangle line7=new CustomRectangle(BOARD_START_X,BOARD_START_Y+6*LINE_DISTANCE,BOARD_WIDTH_HEIGHT,LINE_THICKNESS,Color.gray);

    private final CustomRectangle line8=new CustomRectangle(BOARD_START_X+LINE_DISTANCE,BOARD_START_Y,LINE_THICKNESS,BOARD_WIDTH_HEIGHT,Color.gray);
    private final CustomRectangle line9=new CustomRectangle(BOARD_START_X+2*LINE_DISTANCE,BOARD_START_Y,LINE_THICKNESS,BOARD_WIDTH_HEIGHT,Color.gray);
    private final CustomRectangle line10=new CustomRectangle(BOARD_START_X+3*LINE_DISTANCE,BOARD_START_Y,LINE_THICKNESS,BOARD_WIDTH_HEIGHT,Color.gray);
    private final CustomRectangle line11=new CustomRectangle(BOARD_START_X+4*LINE_DISTANCE,BOARD_START_Y,LINE_THICKNESS,BOARD_WIDTH_HEIGHT,Color.gray);
    private final CustomRectangle line12=new CustomRectangle(BOARD_START_X+5*LINE_DISTANCE,BOARD_START_Y,LINE_THICKNESS,BOARD_WIDTH_HEIGHT,Color.gray);
    private final CustomRectangle line13=new CustomRectangle(BOARD_START_X,BOARD_START_Y,LINE_THICKNESS,BOARD_WIDTH_HEIGHT,Color.gray);

    private final CustomRectangle line14=new CustomRectangle(BOARD_START_X+6*LINE_DISTANCE,BOARD_START_Y,LINE_THICKNESS,2*LINE_DISTANCE+LINE_THICKNESS,Color.gray);
    private final CustomRectangle line15=new CustomRectangle(BOARD_START_X+6*LINE_DISTANCE,BOARD_START_Y+3*LINE_DISTANCE,LINE_THICKNESS,3*LINE_DISTANCE+LINE_THICKNESS,Color.gray);

    public final CustomRectangle[] BOARD =new CustomRectangle[16];

    public CustomRectangle[] getBOARD() {
        BOARD[15]=boardBase;
        BOARD[1]=line1;
        BOARD[2]=line2;
        BOARD[3]=line3;
        BOARD[4]=line4;
        BOARD[5]=line5;
        BOARD[6]=line6;
        BOARD[7]=line7;
        BOARD[8]=line8;
        BOARD[9]=line9;
        BOARD[10]=line10;
        BOARD[11]=line11;
        BOARD[12]=line12;
        BOARD[13]=line13;
        BOARD[14]=line14;
        BOARD[0]=line15;

        return BOARD;
    }

}
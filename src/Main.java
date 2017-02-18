import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.PIDController;
import edu.wpi.first.wpilibj.networktables.NetworkTable;

/**
 * Created by mjam2 on 2017-02-18.
 */
public class Main extends IterativeRobot {

    public PIDController pid5ft;
    public PIDController pid90r;
    public PIDController pid135;
    public PIDController pid45;
    public PIDController pid3ft;
    public PIDController pidLong;
    public PIDController pid90l;

    NetworkTable ft5;
    NetworkTable deg90r;
    NetworkTable deg135;
    NetworkTable deg45;
    NetworkTable ft3;
    NetworkTable ftLong;
    NetworkTable deg90l;

    @Override
    public void robotInit() {
        System.out.println("Robot Initalized!");

        ft5 = NetworkTable.getTable("5ft table");
        ft3 = NetworkTable.getTable("3ft table");
        ftLong = NetworkTable.getTable("Long table");
        deg90r = NetworkTable.getTable("90 deg R table");
        deg135 = NetworkTable.getTable("135 deg table");
        deg45 = NetworkTable.getTable("45 deg table");
        deg90l = NetworkTable.getTable("90 deg L table");

        ft5.putNumber("P", 0);
        ft5.putNumber("I", 0);
        ft5.putNumber("D", 0);

        ft3.putNumber("P", 0);
        ft3.putNumber("I", 0);
        ft3.putNumber("D", 0);

        ftLong.putNumber("P", 0);
        ftLong.putNumber("I", 0);
        ftLong.putNumber("D", 0);

        deg45.putNumber("P", 0);
        deg45.putNumber("I", 0);
        deg45.putNumber("D", 0);

        deg90r.putNumber("P", 0);
        deg90r.putNumber("I", 0);
        deg90r.putNumber("D", 0);

        deg90l.putNumber("P", 0);
        deg90l.putNumber("I", 0);
        deg90l.putNumber("D", 0);

        deg135.putNumber("P", 0);
        deg135.putNumber("I", 0);
        deg135.putNumber("D", 0);

        pid5ft = new PIDController(ft5.getNumber("P", 0), ft5.getNumber("I", 0),ft5.getNumber("D", 0), , this);
        pid90r = new PIDController(ft3.getNumber("P", 0),ft3.getNumber("I", 0),ft3.getNumber("D", 0), , this);
        pid135 = new PIDController(ftLong.getNumber("P", 0),ftLong.getNumber("I", 0),ftLong.getNumber("D", 0), , this);
        pid45 = new PIDController(deg90r.getNumber("P", 0),deg90r.getNumber("I", 0),deg90r.getNumber("D", 0), , this);
        pid3ft = new PIDController(deg135.getNumber("P", 0),deg135.getNumber("I", 0),deg135.getNumber("D", 0), , this);
        pidLong = new PIDController(deg45.getNumber("P", 0),deg45.getNumber("I", 0),deg45.getNumber("D", 0), );
        pid90l = new PIDController(deg90l.getNumber("P", 0),deg90l.getNumber("I", 0),deg90l.getNumber("D", 0), , this);
    }

    @Override
    public void autonomousInit() {

    }

    @Override
    public void autonomousPeriodic() {

    }
}

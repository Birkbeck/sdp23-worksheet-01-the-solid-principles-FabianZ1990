public class UnitUpgrader {
    public void upgrade(Studio studio) {
        studio.squareFootage += 40;
    }

    public void upgrade(PenthouseSuite penthouseSuite) {
        penthouseSuite.squareFootage += 40;
        penthouseSuite.numberOfBedrooms += 1;
    }
}

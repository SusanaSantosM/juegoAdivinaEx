public class Record {
  private String aliasRecord;
  private int puntajeRecord;

  public Record() {
  }

  public Record(String aliasRecord, int puntuacionRecord) {
    this.aliasRecord = aliasRecord;
    this.puntajeRecord = puntuacionRecord;
  }

  public String getAliasRecord() {
    return aliasRecord;
  }

  public void setAliasRecord(String aliasRecord) {
    this.aliasRecord = aliasRecord;
  }

  public int getPuntajeRecord() {
    return puntajeRecord;
  }

  public void setPuntajeRecord(int puntuacionRecord) {
    this.puntajeRecord = puntuacionRecord;
  }
}

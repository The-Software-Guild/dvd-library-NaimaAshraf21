package mthree.library;

import java.time.LocalDate;

public class DVD {

  private String title;
  private LocalDate releaseDate;
  private char mpaaRating;
  private String directorsName;
  private String studio;
  private String ratingNote;

  public DVD(String title, LocalDate releaseDate, char mpaaRating, String directorsName, String studio, String ratingNote) {
    this.title = title;
    this.releaseDate = releaseDate;
    this.mpaaRating = mpaaRating;
    this.directorsName = directorsName;
    this.studio = studio;
    this.ratingNote = ratingNote;
  }

  public void findDVD() {
    System.out.println("Searching " + title + " in the collection.");
    System.out.println("Found " + getTitle());
  }

  @Override
  public String toString() {
    return "DVD: Title = " + this.getTitle() +
            ", Release Date = " + getReleaseDate() +
            ", MPA Rating = " + getMpaaRating() +
            ", Director's Name = " + getDirectorsName() +
            ", Studio = " + getStudio() +
            ", Rating and Note = " + getRatingNote();
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    DVD dvd = (DVD) o;

    if (getMpaaRating() != dvd.getMpaaRating()) return false;
    if (getTitle() != null ? !getTitle().equals(dvd.getTitle()) : dvd.getTitle() != null) return false;
    if (getReleaseDate() != null ? !getReleaseDate().equals(dvd.getReleaseDate()) : dvd.getReleaseDate() != null)
      return false;
    if (getDirectorsName() != null ? !getDirectorsName().equals(dvd.getDirectorsName()) : dvd.getDirectorsName() != null)
      return false;
    if (getStudio() != null ? !getStudio().equals(dvd.getStudio()) : dvd.getStudio() != null) return false;
    return getRatingNote() != null ? getRatingNote().equals(dvd.getRatingNote()) : dvd.getRatingNote() == null;
  }

  @Override
  public int hashCode() {
    int result = getTitle() != null ? getTitle().hashCode() : 0;
    result = 31 * result + (getReleaseDate() != null ? getReleaseDate().hashCode() : 0);
    result = 31 * result + (int) getMpaaRating();
    result = 31 * result + (getDirectorsName() != null ? getDirectorsName().hashCode() : 0);
    result = 31 * result + (getStudio() != null ? getStudio().hashCode() : 0);
    result = 31 * result + (getRatingNote() != null ? getRatingNote().hashCode() : 0);
    return result;
  }

  public void setTitle(String title){
    this.title = title;
  }

  public void setDirectorsName(String directorsName){
    this.directorsName = directorsName;
  }

  public void setStudio(String studio){
    this.studio = studio;
  }

  public void setRatingNote(String ratingNote){
    this.ratingNote = ratingNote;
  }

  public void setMpaaRating(char mpaaRating){
    this.mpaaRating = mpaaRating;
  }

  public String getTitle(){
    return title;
  }

  public String getDirectorsName(){
    return directorsName;
  }

  public String getStudio(){
    return studio;
  }

  public char getMpaaRating() {
    return mpaaRating;
  }

  public LocalDate getReleaseDate() {
    return releaseDate;
  }

  public String getRatingNote() {
    return ratingNote;
  }

  public void setReleaseDate(LocalDate releaseDate) {
    this.releaseDate = releaseDate;
  }

}
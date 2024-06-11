/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * @author ADMIN
 */
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class MatchVM {
    private int Id;
    private int HomeTeamId;
    //Team of Home use get poin
    public String HometeamName;
    public String HometeamImage;
    public String HometeamShortName;
    private int AwayTeamId;
    public String AwayteamName;
    public String AwayteamImage;
    public String AwayteamShortName;
    private int LeagueId;
    private String Name;
    private String Address;
    private LocalDateTime StartAt;
    private LocalDateTime EndAt;
    private int TeamSize;
    private LocalDateTime UpdateAt;
    private int ScoreHome;
    private int ScoreAway;    
    private int Status;

}

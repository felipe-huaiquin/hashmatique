import java.util.Set;
import java.util.HashMap;
public class Hashmatique{
    public static void main(String[] args) {
        HashMap<String,String> trackList = new HashMap<String,String>();
        trackList.put("Zankoku na Tenshi no TE-ZE","Zankoku na tenshi no you ni/Shounen yo, shinwa ni nare");
        trackList.put("Wareta Ringo","naki sou na ao RINGO/kakaete'ru mune no oku/korogatte (KIZUTSUITE MO)/tsuyogatte/kyuukutsu na sora niramu");
        trackList.put("Crossing Field","Mitometeta okubyou na kako/Wakaranai mama ni/Kowagatteta ushiro no jibun ga genjitsu wo/Ima ni utsusu");
        trackList.put("JUSTadICE","(Ki, ki, ki) kimi no koto (wa, wa, wa) wakaranai dakara/(Bo, bo, bo) boku no koto (ki, ki) kitto mada shiranai desho/(Bo, bo, bo) “boku mo” to ka (wa, wa, wa) “wakaru” to ka/Kantan ni iwanai kimi no zetsubougaku junshin nara tsuranuite kowase");
    
        Set<String> songs = trackList.keySet();
        for(String key: songs){
            System.out.println(key +": "+ trackList.get(key));
        } 

    } 
}

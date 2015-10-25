package org.swtk.commons.dict.wiktionary.generated.h.u.s;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryHUS000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("hush", "{\"term\":\"hush\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"middle english (1100-1500)\"], \"text\":\"Back-formation of obsolete Middle english (1100-1500) \u0027husht\u0027 (silent, hushed) a past participle, from the interjection \u0027husht\u0027 (quiet!)\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A silence, especially after some nois\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"It is the \u0027\u0027hush\u0027\u0027 of night\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"A mining method using water\", \"priority\":3}]}, \"synonyms\":{}}");

	add("husbandhood", "{\"term\":\"husbandhood\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|husband|hood|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The condition of being a husband\", \"priority\":1}]}, \"synonyms\":{}}");

	add("husbandman", "{\"term\":\"husbandman\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|husband|man|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"a person who raises crops and tends animals; a farme\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"1606\u0027\u0027 The xviii day of May in the fourth yeare of the Raigne of the kinge most excellent Monarche and in the year of our lord god 1606 I Thomas Knages of Lythe within the county of york \u0027\u0027husbandman\u0027\u0027 sicke in body but whole in mynde and in perfect remembrance praised be to god do make and ordayne this my last will and testament in manner and forme following . . - \u0027The last will and testament of Thomas Knages (1533-1606\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"1684\u0027\u0027 Thomas Tusser, born at Riven-hall, was successively a Musician, School-master, Serving-man, and a Speculative \u0027\u0027Husbandman\u0027\u0027; - \u0027Anglorum Speculum: Or The Worthies of England, in Church and State\u0027 - Thomas Fulle\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"1843\u0027\u0027, Thomas Carlyle, \u0027:w:Past and Present Past and Present\u0027, book 2, ch. XVII, \u0027The beginnings\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"Valiant Wisdom tilling and draining; escorted by owl-eyed Pedantry, by owlish and vulturish and many other forms of Folly; — the valiant \u0027\u0027husbandman\u0027\u0027 assiduously tilling; the blind greedy enemy \u0027too\u0027 assiduously sowing tares\", \"priority\":5},{\"upperType\":\"NOUN\", \"text\":\"1844\u0027\u0027 The \u0027\u0027husbandman\u0027\u0027 must labour before he receives the fruits - \u0027Works ...\u0027 - Jean Calvin\", \"priority\":6}]}, \"synonyms\":{}}");

	add("husker", "{\"term\":\"husker\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"* From {{suffix|husk|er|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"One who husks (as one who removes the husks, leaves, from ears of corn\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A fan or supporter of the Nebraska Cornhuskers, the sports teams of the University of Nebraska\", \"priority\":2}]}, \"synonyms\":{}}");

	add("hussy", "{\"term\":\"hussy\", \"etymology\":{\"influencers\":[{}], \"languages\":[\"English\", \"middle english (1100-1500)\"], \"text\":\"From earlier \u0027hussive\u0027 \u0027hussif\u0027 the regular evolution of Middle english (1100-1500) \u0027huswif\u0027 (housewife) equivalent to {{compound|house|wife|nocat\u003d1|lang\u003den}}. Modern English \u0027housewife\u0027 is a restoration of the compound, after its component parts had become unrecognisable through purely regular phonetic change.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A housewife or housekeeper\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A cheeky or disrespectful girl; a woman showing inappropriate or improper behaviour\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"Molly the dairymaid came a little way from the rickyard, and said she would pluck the pigeon that very night after work. She was always ready to do anything for us boys; and we could never quite make out why they scolded her so for an idle \u0027\u0027hussy\u0027\u0027 indoors. It seemed so unjust. Looking back, I recollect she had very beautiful brown eyes\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"A case or bag for needles, thread, etc\", \"priority\":4}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }
package org.swtk.commons.dict.wordnet.indexbyname.instance.f.e.t;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceFET {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"fet\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03337729\"]}");
	add("{\"term\":\"fetal age\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04932241\"]}");
	add("{\"term\":\"fetal alcohol syndrome\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14328885\"]}");
	add("{\"term\":\"fetal circulation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05519626\"]}");
	add("{\"term\":\"fetal distress\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14117356\"]}");
	add("{\"term\":\"fetal membrane\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05318315\"]}");
	add("{\"term\":\"fetal monitor\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03283825\"]}");
	add("{\"term\":\"fetal movement\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00335000\"]}");
	add("{\"term\":\"fetch\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00040654\"]}");
	add("{\"term\":\"fete\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00518784\", \"07464462\"]}");
	add("{\"term\":\"fete champetre\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08272429\"]}");
	add("{\"term\":\"fete day\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15186678\"]}");
	add("{\"term\":\"feterita\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12158471\"]}");
	add("{\"term\":\"fetich\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01209832\", \"03609171\"]}");
	add("{\"term\":\"fetichism\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00739356\", \"05954076\"]}");
	add("{\"term\":\"feticide\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00232182\"]}");
	add("{\"term\":\"fetid bugbane\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11749611\"]}");
	add("{\"term\":\"fetid horehound\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12862632\"]}");
	add("{\"term\":\"fetidness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04987905\"]}");
	add("{\"term\":\"fetish\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"01209832\", \"03609171\", \"07504434\"]}");
	add("{\"term\":\"fetishism\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00739356\", \"05954076\"]}");
	add("{\"term\":\"fetishist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10105317\"]}");
	add("{\"term\":\"fetlock\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02464980\", \"02465095\"]}");
	add("{\"term\":\"fetlock joint\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02465095\"]}");
	add("{\"term\":\"fetology\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06063385\"]}");
	add("{\"term\":\"fetometry\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01004226\"]}");
	add("{\"term\":\"fetoprotein\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15058229\"]}");
	add("{\"term\":\"fetor\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05722841\"]}");
	add("{\"term\":\"fetoscope\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03335737\"]}");
	add("{\"term\":\"fetoscopy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00946272\"]}");
	add("{\"term\":\"fetter\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03335892\"]}");
	add("{\"term\":\"fetter bone\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02464697\"]}");
	add("{\"term\":\"fetter bush\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12261943\"]}");
	add("{\"term\":\"fetterbush\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"12261943\", \"12264210\"]}");
	add("{\"term\":\"fettle\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14570198\"]}");
	add("{\"term\":\"fettuccine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07716383\"]}");
	add("{\"term\":\"fettuccine alfredo\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07716511\"]}");
	add("{\"term\":\"fettuccini\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07716383\"]}");
	add("{\"term\":\"fetus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01462432\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }
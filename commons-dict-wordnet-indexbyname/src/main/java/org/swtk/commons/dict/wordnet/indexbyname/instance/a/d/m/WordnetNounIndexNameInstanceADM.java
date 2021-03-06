package org.swtk.commons.dict.wordnet.indexbyname.instance.a.d.m;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceADM {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"adman\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09793385\"]}");
	add("{\"term\":\"admass\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08197402\"]}");
	add("{\"term\":\"administration\", \"synsetCount\":6, \"upperType\":\"NOUN\", \"ids\":[\"00696119\", \"01127115\", \"15291076\", \"00696243\", \"08181484\", \"01138273\"]}");
	add("{\"term\":\"administrative body\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08094128\"]}");
	add("{\"term\":\"administrative data processing\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13448806\"]}");
	add("{\"term\":\"administrative district\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08508836\"]}");
	add("{\"term\":\"administrative division\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08508836\"]}");
	add("{\"term\":\"administrative hearing\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01202490\"]}");
	add("{\"term\":\"administrative law\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08470119\"]}");
	add("{\"term\":\"administrative official\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09899893\"]}");
	add("{\"term\":\"administrative unit\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08094128\"]}");
	add("{\"term\":\"administrator\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"09789895\", \"09790166\", \"09790372\"]}");
	add("{\"term\":\"administrivia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01139527\"]}");
	add("{\"term\":\"admirability\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04736385\"]}");
	add("{\"term\":\"admirableness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04736385\"]}");
	add("{\"term\":\"admiral\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02278910\", \"09790627\"]}");
	add("{\"term\":\"admiral byrd\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10896550\"]}");
	add("{\"term\":\"admiral dewey\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10952835\"]}");
	add("{\"term\":\"admiral nelson\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11223049\"]}");
	add("{\"term\":\"admiral nimitz\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11227919\"]}");
	add("{\"term\":\"admiralty\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00589740\", \"08366475\"]}");
	add("{\"term\":\"admiralty brass\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14984400\"]}");
	add("{\"term\":\"admiralty island\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09079633\"]}");
	add("{\"term\":\"admiralty islands\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08862077\"]}");
	add("{\"term\":\"admiralty law\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08471202\"]}");
	add("{\"term\":\"admiralty metal\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14984400\"]}");
	add("{\"term\":\"admiralty mile\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13682724\"]}");
	add("{\"term\":\"admiralty range\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09210991\"]}");
	add("{\"term\":\"admiration\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"01221083\", \"07525235\", \"07515980\"]}");
	add("{\"term\":\"admirer\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"09790858\", \"09791087\", \"10697152\"]}");
	add("{\"term\":\"admissibility\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04800247\"]}");
	add("{\"term\":\"admission\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"05183715\", \"13342517\", \"07230608\", \"01250738\"]}");
	add("{\"term\":\"admission charge\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13342517\"]}");
	add("{\"term\":\"admission day\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15183149\"]}");
	add("{\"term\":\"admission fee\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13342517\"]}");
	add("{\"term\":\"admission price\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13342517\"]}");
	add("{\"term\":\"admittance\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01250738\", \"05183715\"]}");
	add("{\"term\":\"admixture\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00380891\", \"02683938\", \"14511182\"]}");
	add("{\"term\":\"admonisher\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09791278\"]}");
	add("{\"term\":\"admonishment\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06727359\"]}");
	add("{\"term\":\"admonition\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06727359\", \"06685042\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }
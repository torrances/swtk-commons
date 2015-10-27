package org.swtk.commons.dict.wordnet.index.name.instance.a.d.m.i;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceADMI {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"administration\", \"synsetCount\":6, \"upperType\":\"NOUN\", \"ids\":[\"00696119\", \"01127115\", \"15291076\", \"00696243\", \"08181484\", \"01138273\"]}");
	add("{\"term\":\"administrator\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"09789895\", \"09790166\", \"09790372\"]}");
	add("{\"term\":\"administrivia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01139527\"]}");
	add("{\"term\":\"admirability\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04736385\"]}");
	add("{\"term\":\"admirableness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04736385\"]}");
	add("{\"term\":\"admiral\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02278910\", \"09790627\"]}");
	add("{\"term\":\"admiralty\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00589740\", \"08366475\"]}");
	add("{\"term\":\"admiration\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"01221083\", \"07525235\", \"07515980\"]}");
	add("{\"term\":\"admirer\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"09790858\", \"09791087\", \"10697152\"]}");
	add("{\"term\":\"admissibility\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04800247\"]}");
	add("{\"term\":\"admission\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"05183715\", \"13342517\", \"07230608\", \"01250738\"]}");
	add("{\"term\":\"admittance\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01250738\", \"05183715\"]}");
	add("{\"term\":\"admixture\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00380891\", \"02683938\", \"14511182\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }
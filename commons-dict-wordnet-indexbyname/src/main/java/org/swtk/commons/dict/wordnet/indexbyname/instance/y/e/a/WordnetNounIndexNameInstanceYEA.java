package org.swtk.commons.dict.wordnet.indexbyname.instance.y.e.a;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceYEA {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"yea\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07218668\"]}");
	add("{\"term\":\"year\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"08255581\", \"15226340\", \"15229093\", \"15228587\"]}");
	add("{\"term\":\"year dot\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15269162\"]}");
	add("{\"term\":\"year of grace\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15274269\"]}");
	add("{\"term\":\"yearbook\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06438138\", \"07297202\"]}");
	add("{\"term\":\"yearling\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"01890822\", \"02387866\", \"10734114\"]}");
	add("{\"term\":\"yearly\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06438138\"]}");
	add("{\"term\":\"yearner\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10290575\"]}");
	add("{\"term\":\"yearning\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07501768\"]}");
	add("{\"term\":\"years\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"15166019\", \"15267766\", \"15178747\"]}");
	add("{\"term\":\"yeast\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"13046407\", \"15130838\"]}");
	add("{\"term\":\"yeast cake\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07656169\"]}");
	add("{\"term\":\"yeats\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11422459\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }
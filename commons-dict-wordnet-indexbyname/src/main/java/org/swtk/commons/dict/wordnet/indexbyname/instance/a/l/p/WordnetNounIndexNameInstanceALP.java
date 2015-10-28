package org.swtk.commons.dict.wordnet.indexbyname.instance.a.l.p;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceALP {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"alp\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09216583\"]}");
	add("{\"term\":\"alpaca\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"02440903\", \"02701332\", \"15129165\"]}");
	add("{\"term\":\"alpena\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09122680\"]}");
	add("{\"term\":\"alpenstock\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02701493\"]}");
	add("{\"term\":\"alpha\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07343769\", \"06847188\"]}");
	add("{\"term\":\"alphabet\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05881364\", \"06509450\"]}");
	add("{\"term\":\"alphabetisation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01012970\"]}");
	add("{\"term\":\"alphabetiser\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09804850\"]}");
	add("{\"term\":\"alphabetization\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01012970\"]}");
	add("{\"term\":\"alphabetizer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09804850\"]}");
	add("{\"term\":\"alphanumerics\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06512253\"]}");
	add("{\"term\":\"alphavirus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01335129\"]}");
	add("{\"term\":\"alpinia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12377185\"]}");
	add("{\"term\":\"alpinism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00326801\"]}");
	add("{\"term\":\"alpinist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09805100\"]}");
	add("{\"term\":\"alprazolam\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02702202\"]}");
	add("{\"term\":\"alps\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09217235\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }
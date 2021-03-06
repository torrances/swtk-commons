package org.swtk.commons.dict.wordnet.indexbyname.instance.b.a.u;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceBAU {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"bauble\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02790458\", \"07282407\"]}");
	add("{\"term\":\"baud\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13600882\"]}");
	add("{\"term\":\"baud rate\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13600882\"]}");
	add("{\"term\":\"baudelaire\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10858080\"]}");
	add("{\"term\":\"bauhaus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05850151\"]}");
	add("{\"term\":\"bauhinia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12511176\"]}");
	add("{\"term\":\"bauhinia monandra\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12511332\"]}");
	add("{\"term\":\"bauhinia variegata\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12511522\"]}");
	add("{\"term\":\"baulk\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"04052724\", \"05697054\", \"08533228\"]}");
	add("{\"term\":\"baulker\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09853385\"]}");
	add("{\"term\":\"baum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10858261\"]}");
	add("{\"term\":\"bauxite\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14692438\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }
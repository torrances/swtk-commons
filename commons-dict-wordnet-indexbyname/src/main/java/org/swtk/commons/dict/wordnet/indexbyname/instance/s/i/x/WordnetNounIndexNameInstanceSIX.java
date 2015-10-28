package org.swtk.commons.dict.wordnet.indexbyname.instance.s.i.x;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSIX {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"six\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04232479\", \"13766862\"]}");
	add("{\"term\":\"sixer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13766862\"]}");
	add("{\"term\":\"sixpack\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04232284\"]}");
	add("{\"term\":\"sixpence\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13412625\"]}");
	add("{\"term\":\"sixsome\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08004131\"]}");
	add("{\"term\":\"sixteen\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13769746\"]}");
	add("{\"term\":\"sixteenth\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"13760725\", \"13870663\"]}");
	add("{\"term\":\"sixth\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"06872975\", \"13760092\", \"13869599\"]}");
	add("{\"term\":\"sixties\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"15174973\", \"15175094\"]}");
	add("{\"term\":\"sixtieth\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"13760980\", \"13871493\"]}");
	add("{\"term\":\"sixty\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13771918\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }
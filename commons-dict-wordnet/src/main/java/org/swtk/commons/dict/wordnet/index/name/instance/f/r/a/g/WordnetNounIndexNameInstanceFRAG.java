package org.swtk.commons.dict.wordnet.index.name.instance.f.r.a.g;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceFRAG {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"fragaria\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12650707\"]}");
	add("{\"term\":\"fragility\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05048657\", \"05050909\"]}");
	add("{\"term\":\"fragment\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"07021796\", \"04191744\", \"09308160\"]}");
	add("{\"term\":\"fragmentation\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"07423721\", \"13505506\", \"14017002\", \"00389018\"]}");
	add("{\"term\":\"fragonard\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10997155\"]}");
	add("{\"term\":\"fragrance\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04987712\", \"05722413\"]}");
	add("{\"term\":\"fragrancy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04987712\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }
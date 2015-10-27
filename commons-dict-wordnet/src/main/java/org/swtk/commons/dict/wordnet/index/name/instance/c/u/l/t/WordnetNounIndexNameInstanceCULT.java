package org.swtk.commons.dict.wordnet.index.name.instance.c.u.l.t;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceCULT {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"cult\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"05957131\", \"05957404\", \"08168236\", \"05759170\", \"08168497\"]}");
	add("{\"term\":\"cultism\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01046545\", \"01209264\"]}");
	add("{\"term\":\"cultist\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10002055\", \"10001900\"]}");
	add("{\"term\":\"cultivar\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13105594\"]}");
	add("{\"term\":\"cultivation\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"00917854\", \"13475491\", \"14483408\", \"00917553\", \"01131684\"]}");
	add("{\"term\":\"cultivator\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03151512\", \"09799231\"]}");
	add("{\"term\":\"culturati\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08404226\"]}");
	add("{\"term\":\"culture\", \"synsetCount\":7, \"upperType\":\"NOUN\", \"ids\":[\"00919573\", \"06204144\", \"14483408\", \"00922324\", \"05993821\", \"05759791\", \"08304765\"]}");
	add("{\"term\":\"cultus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05957131\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }
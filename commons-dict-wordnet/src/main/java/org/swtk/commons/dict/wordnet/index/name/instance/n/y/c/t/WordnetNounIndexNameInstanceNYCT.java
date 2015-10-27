package org.swtk.commons.dict.wordnet.index.name.instance.n.y.c.t;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceNYCT {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"nyctaginaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11856275\"]}");
	add("{\"term\":\"nyctaginia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11856606\"]}");
	add("{\"term\":\"nyctalopia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14578445\"]}");
	add("{\"term\":\"nyctanassa\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02013535\"]}");
	add("{\"term\":\"nyctereutes\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02118974\"]}");
	add("{\"term\":\"nycticebus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02501519\"]}");
	add("{\"term\":\"nycticorax\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02013246\"]}");
	add("{\"term\":\"nyctimene\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02143009\"]}");
	add("{\"term\":\"nyctophobia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14407446\"]}");
	add("{\"term\":\"nycturia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13543688\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }
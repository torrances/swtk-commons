package org.swtk.commons.dict.wordnet.index.name.instance.c.l.a.y;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceCLAY {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"clay\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"05225393\", \"10919703\", \"10919898\", \"14980464\", \"14837352\"]}");
	add("{\"term\":\"claymore\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03043338\", \"03043478\"]}");
	add("{\"term\":\"claystone\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14838589\"]}");
	add("{\"term\":\"claytonia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11879493\"]}");
	add("{\"term\":\"clayware\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03999061\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }
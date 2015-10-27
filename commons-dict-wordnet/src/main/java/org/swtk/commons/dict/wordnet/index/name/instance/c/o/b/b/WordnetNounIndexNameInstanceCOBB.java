package org.swtk.commons.dict.wordnet.index.name.instance.c.o.b.b;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceCOBB {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"cobber\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09952478\"]}");
	add("{\"term\":\"cobble\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03063531\"]}");
	add("{\"term\":\"cobbler\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"07641440\", \"07930014\", \"09952556\"]}");
	add("{\"term\":\"cobblers\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05532751\", \"06620758\"]}");
	add("{\"term\":\"cobblestone\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03063531\"]}");
	add("{\"term\":\"cobbling\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00619105\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }
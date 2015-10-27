package org.swtk.commons.dict.wordnet.index.name.instance.j.u.d.i;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceJUDI {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"judicatory\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08183217\"]}");
	add("{\"term\":\"judicature\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"00595059\", \"00696119\", \"08183217\", \"08346380\"]}");
	add("{\"term\":\"judiciary\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"08183217\", \"08183086\"]}");
	add("{\"term\":\"judiciousness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04897556\", \"05623156\"]}");
	add("{\"term\":\"judith\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06471504\", \"10245889\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }
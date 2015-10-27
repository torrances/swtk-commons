package org.swtk.commons.dict.wordnet.index.name.instance.t.w.e.l;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceTWEL {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"twelfth\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"13760599\", \"13870249\"]}");
	add("{\"term\":\"twelfthtide\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15219695\"]}");
	add("{\"term\":\"twelve\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13768925\"]}");
	add("{\"term\":\"twelvemonth\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15228587\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }
package org.swtk.commons.dict.wordnet.index.name.instance.n.o.v.i;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceNOVI {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"novial\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06910082\"]}");
	add("{\"term\":\"novice\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10383612\", \"10383897\"]}");
	add("{\"term\":\"noviciate\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15320127\"]}");
	add("{\"term\":\"novillada\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03838834\"]}");
	add("{\"term\":\"novillero\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09856046\"]}");
	add("{\"term\":\"novitiate\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10383897\", \"15320127\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }
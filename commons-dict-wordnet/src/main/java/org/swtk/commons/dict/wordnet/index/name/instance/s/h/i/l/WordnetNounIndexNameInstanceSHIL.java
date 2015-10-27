package org.swtk.commons.dict.wordnet.index.name.instance.s.h.i.l;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSHIL {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"shill\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10608810\"]}");
	add("{\"term\":\"shillalah\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04200785\"]}");
	add("{\"term\":\"shillelagh\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04200785\"]}");
	add("{\"term\":\"shilling\", \"synsetCount\":6, \"upperType\":\"NOUN\", \"ids\":[\"13410936\", \"13708982\", \"13728733\", \"13728969\", \"13729211\", \"13729451\"]}");
	add("{\"term\":\"shillyshally\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01069286\"]}");
	add("{\"term\":\"shiloh\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01296993\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }
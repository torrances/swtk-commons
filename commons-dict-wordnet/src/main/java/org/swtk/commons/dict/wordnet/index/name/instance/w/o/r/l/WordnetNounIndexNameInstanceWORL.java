package org.swtk.commons.dict.wordnet.index.name.instance.w.o.r.l;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceWORL {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"world\", \"synsetCount\":8, \"upperType\":\"NOUN\", \"ids\":[\"02475618\", \"05678816\", \"09503939\", \"08196607\", \"09293800\", \"05817904\", \"07982551\", \"09489410\"]}");
	add("{\"term\":\"worldliness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04628881\", \"04887468\"]}");
	add("{\"term\":\"worldling\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10718758\", \"10811530\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }
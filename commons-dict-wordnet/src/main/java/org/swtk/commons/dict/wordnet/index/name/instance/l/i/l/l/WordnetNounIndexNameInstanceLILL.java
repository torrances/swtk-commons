package org.swtk.commons.dict.wordnet.index.name.instance.l.i.l.l;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceLILL {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"lille\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08956249\"]}");
	add("{\"term\":\"lillie\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11152107\"]}");
	add("{\"term\":\"lilliput\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05638517\"]}");
	add("{\"term\":\"lilliputian\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09624603\", \"10282577\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }
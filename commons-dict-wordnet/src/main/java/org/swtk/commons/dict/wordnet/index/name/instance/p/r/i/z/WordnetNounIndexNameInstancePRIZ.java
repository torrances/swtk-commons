package org.swtk.commons.dict.wordnet.index.name.instance.p.r.i.z;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstancePRIZ {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"prize\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"04495252\", \"13283562\", \"13289169\"]}");
	add("{\"term\":\"prizefight\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07486946\"]}");
	add("{\"term\":\"prizefighter\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10496662\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }
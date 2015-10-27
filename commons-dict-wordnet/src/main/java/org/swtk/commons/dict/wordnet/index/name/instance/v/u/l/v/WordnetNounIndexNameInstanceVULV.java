package org.swtk.commons.dict.wordnet.index.name.instance.v.u.l.v;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceVULV {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"vulva\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05529287\"]}");
	add("{\"term\":\"vulvectomy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00717928\"]}");
	add("{\"term\":\"vulvitis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14382398\"]}");
	add("{\"term\":\"vulvovaginitis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14382478\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }
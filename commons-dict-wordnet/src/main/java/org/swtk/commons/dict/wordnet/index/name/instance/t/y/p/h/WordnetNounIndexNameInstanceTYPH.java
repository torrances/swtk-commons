package org.swtk.commons.dict.wordnet.index.name.instance.t.y.p.h;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceTYPH {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"typha\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12175976\"]}");
	add("{\"term\":\"typhaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12175776\"]}");
	add("{\"term\":\"typhlopidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01742924\"]}");
	add("{\"term\":\"typhoeus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09525832\"]}");
	add("{\"term\":\"typhoid\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14167898\"]}");
	add("{\"term\":\"typhon\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09526038\"]}");
	add("{\"term\":\"typhoon\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11541578\"]}");
	add("{\"term\":\"typhus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14164544\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }
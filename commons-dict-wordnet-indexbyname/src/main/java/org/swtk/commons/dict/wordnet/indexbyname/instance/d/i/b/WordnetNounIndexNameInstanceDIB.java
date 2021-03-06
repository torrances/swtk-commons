package org.swtk.commons.dict.wordnet.indexbyname.instance.d.i.b;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceDIB {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"dibasic acid\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14635336\"]}");
	add("{\"term\":\"dibasic salt\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14635457\"]}");
	add("{\"term\":\"dibber\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03195142\"]}");
	add("{\"term\":\"dibble\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03195142\"]}");
	add("{\"term\":\"dibbuk\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09566283\"]}");
	add("{\"term\":\"dibrach\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07110561\"]}");
	add("{\"term\":\"dibranch\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01972070\"]}");
	add("{\"term\":\"dibranchia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01971744\"]}");
	add("{\"term\":\"dibranchiata\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01971744\"]}");
	add("{\"term\":\"dibranchiate\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01972070\"]}");
	add("{\"term\":\"dibranchiate mollusk\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01972070\"]}");
	add("{\"term\":\"dibs\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06742990\"]}");
	add("{\"term\":\"dibucaine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03195339\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }
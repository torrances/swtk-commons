package org.swtk.commons.dict.wordnet.indexbyname.instance.m.e.c;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceMEC {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"mecca\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"08616124\", \"09016460\"]}");
	add("{\"term\":\"meccano\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03742300\"]}");
	add("{\"term\":\"mechanic\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09845152\", \"10298715\"]}");
	add("{\"term\":\"mechanics\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00099205\", \"06109843\"]}");
	add("{\"term\":\"mechanisation\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00103277\", \"14601847\"]}");
	add("{\"term\":\"mechanism\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"03743963\", \"05981648\", \"09372694\", \"00099205\", \"13533709\"]}");
	add("{\"term\":\"mechanist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10324450\"]}");
	add("{\"term\":\"mechanization\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00103277\", \"14601847\"]}");
	add("{\"term\":\"mecholyl\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03759355\"]}");
	add("{\"term\":\"meclizine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03744627\"]}");
	add("{\"term\":\"meclofenamate\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03744818\"]}");
	add("{\"term\":\"meclomen\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03744818\"]}");
	add("{\"term\":\"meconium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14879301\"]}");
	add("{\"term\":\"meconopsis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11927182\"]}");
	add("{\"term\":\"mecoptera\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02164596\"]}");
	add("{\"term\":\"mecopteran\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02164887\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }
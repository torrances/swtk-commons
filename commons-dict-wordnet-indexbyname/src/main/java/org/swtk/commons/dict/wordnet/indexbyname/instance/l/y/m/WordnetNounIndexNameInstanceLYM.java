package org.swtk.commons.dict.wordnet.indexbyname.instance.l.y.m;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceLYM {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"lymantria\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02288561\"]}");
	add("{\"term\":\"lymantriid\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02288200\"]}");
	add("{\"term\":\"lymantriidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02288011\"]}");
	add("{\"term\":\"lymph\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05411417\"]}");
	add("{\"term\":\"lymphadenitis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14372946\"]}");
	add("{\"term\":\"lymphadenoma\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14265215\"]}");
	add("{\"term\":\"lymphadenopathy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14265307\"]}");
	add("{\"term\":\"lymphangiectasia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14087668\"]}");
	add("{\"term\":\"lymphangiectasis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14087668\"]}");
	add("{\"term\":\"lymphangiogram\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03704311\"]}");
	add("{\"term\":\"lymphangiography\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00907226\"]}");
	add("{\"term\":\"lymphangioma\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14271436\"]}");
	add("{\"term\":\"lymphangitis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14373033\"]}");
	add("{\"term\":\"lymphedema\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14144096\"]}");
	add("{\"term\":\"lymphoblast\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05460341\"]}");
	add("{\"term\":\"lymphocyte\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05458960\"]}");
	add("{\"term\":\"lymphocytopenia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14220305\"]}");
	add("{\"term\":\"lymphocytosis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14220447\"]}");
	add("{\"term\":\"lymphogranuloma\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14341457\"]}");
	add("{\"term\":\"lymphography\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00907226\"]}");
	add("{\"term\":\"lymphokine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14968088\"]}");
	add("{\"term\":\"lymphoma\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14265450\"]}");
	add("{\"term\":\"lymphopenia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14220305\"]}");
	add("{\"term\":\"lymphopoiesis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13530586\"]}");
	add("{\"term\":\"lymphuria\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14291496\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }
package org.swtk.commons.dict.wordnet.indexbyname.instance.l.a.d;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceLAD {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"lad\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09890635\", \"09927483\"]}");
	add("{\"term\":\"ladanum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12395624\"]}");
	add("{\"term\":\"ladder\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"07457610\", \"13963344\", \"03637568\"]}");
	add("{\"term\":\"laddie\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09890635\"]}");
	add("{\"term\":\"ladin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06980726\"]}");
	add("{\"term\":\"lading\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02967841\"]}");
	add("{\"term\":\"ladino\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06979956\"]}");
	add("{\"term\":\"ladle\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03638382\"]}");
	add("{\"term\":\"ladoga\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09354725\"]}");
	add("{\"term\":\"lady\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"10262488\", \"10008828\", \"10262834\"]}");
	add("{\"term\":\"ladybeetle\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02168108\"]}");
	add("{\"term\":\"ladybird\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02168108\"]}");
	add("{\"term\":\"ladybug\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02168108\"]}");
	add("{\"term\":\"ladyfinger\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07652566\"]}");
	add("{\"term\":\"ladyfish\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02544648\"]}");
	add("{\"term\":\"ladylikeness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04675178\"]}");
	add("{\"term\":\"ladylove\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10263081\"]}");
	add("{\"term\":\"ladyship\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06354347\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }
package org.swtk.commons.dict.wordnet.indexbyname.instance.t.i.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceTIE {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"tie\", \"synsetCount\":9, \"upperType\":\"NOUN\", \"ids\":[\"04440319\", \"04440719\", \"06879174\", \"07368316\", \"03679297\", \"04440511\", \"13970354\", \"13953418\", \"03821155\"]}");
	add("{\"term\":\"tie beam\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04440511\"]}");
	add("{\"term\":\"tie clip\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04440934\"]}");
	add("{\"term\":\"tie rack\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04441341\"]}");
	add("{\"term\":\"tie rod\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04441665\"]}");
	add("{\"term\":\"tie tack\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04441804\"]}");
	add("{\"term\":\"tieback\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04026275\"]}");
	add("{\"term\":\"tiebreaker\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15259266\"]}");
	add("{\"term\":\"tien shan\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09481717\"]}");
	add("{\"term\":\"tientsin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08746715\"]}");
	add("{\"term\":\"tiepin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04441804\"]}");
	add("{\"term\":\"tiepolo\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11362186\"]}");
	add("{\"term\":\"tier\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"04441039\", \"04441193\", \"10730052\", \"10730158\", \"14451564\"]}");
	add("{\"term\":\"tier up\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10730052\"]}");
	add("{\"term\":\"tierce\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"13759330\", \"13766184\", \"15254671\"]}");
	add("{\"term\":\"tiercel\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01608818\"]}");
	add("{\"term\":\"tiered seat\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04441419\"]}");
	add("{\"term\":\"tierra del fuego\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08740227\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }
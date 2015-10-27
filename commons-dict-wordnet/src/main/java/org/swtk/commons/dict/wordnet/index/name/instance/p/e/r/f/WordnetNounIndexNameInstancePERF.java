package org.swtk.commons.dict.wordnet.index.name.instance.p.e.r.f;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstancePERF {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"perfect\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13828352\"]}");
	add("{\"term\":\"perfecta\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00508036\"]}");
	add("{\"term\":\"perfecter\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10435184\"]}");
	add("{\"term\":\"perfectibility\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05631227\"]}");
	add("{\"term\":\"perfection\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00261337\", \"05933151\", \"14482870\"]}");
	add("{\"term\":\"perfectionism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04645079\"]}");
	add("{\"term\":\"perfectionist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10434975\"]}");
	add("{\"term\":\"perfective\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"13827101\", \"13828352\"]}");
	add("{\"term\":\"perfidiousness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04887159\"]}");
	add("{\"term\":\"perfidy\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00751065\", \"04887159\"]}");
	add("{\"term\":\"perfluorocarbon\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15003691\"]}");
	add("{\"term\":\"perforation\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00946449\", \"09412760\", \"03922019\"]}");
	add("{\"term\":\"performance\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"13546752\", \"00047847\", \"00098324\", \"00551808\", \"06904543\"]}");
	add("{\"term\":\"performer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10435383\"]}");
	add("{\"term\":\"performing\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00549363\"]}");
	add("{\"term\":\"perfume\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03922150\", \"05722413\"]}");
	add("{\"term\":\"perfumer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10436015\"]}");
	add("{\"term\":\"perfumery\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"00939210\", \"03922408\", \"03922504\", \"03922589\"]}");
	add("{\"term\":\"perfusion\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00325059\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }
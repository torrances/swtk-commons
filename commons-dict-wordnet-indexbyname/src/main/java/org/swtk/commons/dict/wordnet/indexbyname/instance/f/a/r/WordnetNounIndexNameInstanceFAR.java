package org.swtk.commons.dict.wordnet.indexbyname.instance.f.a.r;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceFAR {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"far\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08033653\"]}");
	add("{\"term\":\"farad\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13657765\"]}");
	add("{\"term\":\"faraday\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10986310\"]}");
	add("{\"term\":\"farandole\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00533933\"]}");
	add("{\"term\":\"farawayness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05092372\"]}");
	add("{\"term\":\"farc\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08058935\"]}");
	add("{\"term\":\"farce\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07694885\", \"07029364\"]}");
	add("{\"term\":\"fardel\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05841576\"]}");
	add("{\"term\":\"fare\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"07576217\", \"10098423\", \"13329169\", \"05919718\"]}");
	add("{\"term\":\"farewell\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00053917\", \"06641899\"]}");
	add("{\"term\":\"farfalle\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07715175\"]}");
	add("{\"term\":\"fargo\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09152606\"]}");
	add("{\"term\":\"farina\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07583806\"]}");
	add("{\"term\":\"farkleberry\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12267290\"]}");
	add("{\"term\":\"farm\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03327044\"]}");
	add("{\"term\":\"farmer\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"10986488\", \"10986657\", \"10098586\"]}");
	add("{\"term\":\"farmerette\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10098990\"]}");
	add("{\"term\":\"farmhand\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10099179\"]}");
	add("{\"term\":\"farmhouse\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03327781\"]}");
	add("{\"term\":\"farming\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00454755\", \"00918295\"]}");
	add("{\"term\":\"farmington\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09091563\", \"09138306\"]}");
	add("{\"term\":\"farmland\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09283813\", \"08587011\"]}");
	add("{\"term\":\"farmplace\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03328041\"]}");
	add("{\"term\":\"farmstead\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03328041\", \"13270498\"]}");
	add("{\"term\":\"farmyard\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03328156\"]}");
	add("{\"term\":\"farness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05092372\"]}");
	add("{\"term\":\"faro\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00493735\"]}");
	add("{\"term\":\"faroes\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"08972401\", \"08972629\"]}");
	add("{\"term\":\"faroese\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06967827\"]}");
	add("{\"term\":\"farrago\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08416934\"]}");
	add("{\"term\":\"farragut\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10986974\"]}");
	add("{\"term\":\"farrell\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10987144\", \"10987303\"]}");
	add("{\"term\":\"farrier\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10099457\"]}");
	add("{\"term\":\"farrow\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13500237\"]}");
	add("{\"term\":\"farrowing\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13500237\"]}");
	add("{\"term\":\"farsi\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06986787\", \"10099549\"]}");
	add("{\"term\":\"farsightedness\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"05813285\", \"14577603\", \"14578806\"]}");
	add("{\"term\":\"fart\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00841258\"]}");
	add("{\"term\":\"farthing\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13413959\"]}");
	add("{\"term\":\"farthingale\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03328264\"]}");
	add("{\"term\":\"farting\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00841258\"]}");
	add("{\"term\":\"fartlek\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00895329\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }
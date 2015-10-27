package org.swtk.commons.dict.wordnet.index.name.instance.i.n.s.t;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceINST {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"instability\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"04782986\", \"14027634\", \"04813295\", \"13999106\"]}");
	add("{\"term\":\"installation\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"07467805\", \"03319968\", \"00241805\"]}");
	add("{\"term\":\"installing\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00241805\"]}");
	add("{\"term\":\"installment\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"00241805\", \"06403409\", \"06634278\", \"13322737\"]}");
	add("{\"term\":\"instalment\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00241805\", \"06403409\", \"06634278\"]}");
	add("{\"term\":\"instance\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05828980\", \"07323507\"]}");
	add("{\"term\":\"instancy\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05179658\", \"05066676\"]}");
	add("{\"term\":\"instant\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"15269461\", \"15271921\"]}");
	add("{\"term\":\"instantaneousness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05066676\"]}");
	add("{\"term\":\"instantiation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05935801\"]}");
	add("{\"term\":\"instar\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02311894\"]}");
	add("{\"term\":\"instauration\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00241051\"]}");
	add("{\"term\":\"instep\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03579394\", \"05584581\"]}");
	add("{\"term\":\"instigant\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10228847\"]}");
	add("{\"term\":\"instigation\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00157445\", \"07266287\"]}");
	add("{\"term\":\"instigator\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10228683\", \"10228847\"]}");
	add("{\"term\":\"instillation\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"14944879\", \"00322557\"]}");
	add("{\"term\":\"instillator\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03579567\"]}");
	add("{\"term\":\"instilling\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00890760\"]}");
	add("{\"term\":\"instillment\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00322557\"]}");
	add("{\"term\":\"instilment\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00322557\"]}");
	add("{\"term\":\"instinct\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05630506\"]}");
	add("{\"term\":\"institute\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08424287\"]}");
	add("{\"term\":\"institution\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"03752065\", \"00241051\", \"05677194\", \"03579706\", \"08070328\"]}");
	add("{\"term\":\"instroke\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07365980\"]}");
	add("{\"term\":\"instruction\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"06597067\", \"00888759\", \"00884975\", \"06799486\"]}");
	add("{\"term\":\"instructions\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06433787\"]}");
	add("{\"term\":\"instructor\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10713754\"]}");
	add("{\"term\":\"instructorship\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00594847\"]}");
	add("{\"term\":\"instructress\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10229140\"]}");
	add("{\"term\":\"instrument\", \"synsetCount\":6, \"upperType\":\"NOUN\", \"ids\":[\"03806455\", \"06343724\", \"06491336\", \"10229217\", \"00174610\", \"03579967\"]}");
	add("{\"term\":\"instrumentalism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05983918\"]}");
	add("{\"term\":\"instrumentalist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10360025\"]}");
	add("{\"term\":\"instrumentality\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"03580409\", \"05157705\", \"08163142\"]}");
	add("{\"term\":\"instrumentation\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"00941634\", \"07052656\", \"00098168\", \"03580409\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }
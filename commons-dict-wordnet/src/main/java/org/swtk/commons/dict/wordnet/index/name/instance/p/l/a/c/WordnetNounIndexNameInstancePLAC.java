package org.swtk.commons.dict.wordnet.index.name.instance.p.l.a.c;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstancePLAC {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"placard\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06806283\"]}");
	add("{\"term\":\"placation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01153902\"]}");
	add("{\"term\":\"place\", \"synsetCount\":16, \"upperType\":\"NOUN\", \"ids\":[\"06401196\", \"06495143\", \"08637370\", \"13971047\", \"06412750\", \"08665191\", \"13970825\", \"08639173\", \"00587299\", \"08577045\", \"13949819\", \"00722683\", \"08659612\", \"05619605\", \"08530790\", \"08682181\"]}");
	add("{\"term\":\"placebo\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01036717\", \"03958972\"]}");
	add("{\"term\":\"placeholder\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07286183\", \"10506494\"]}");
	add("{\"term\":\"placekicker\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10456618\"]}");
	add("{\"term\":\"placeman\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10456781\"]}");
	add("{\"term\":\"placement\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"01053255\", \"00040728\", \"05082771\"]}");
	add("{\"term\":\"placenta\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05528350\", \"11701307\"]}");
	add("{\"term\":\"placental\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01889397\"]}");
	add("{\"term\":\"placentation\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"11701464\", \"13559283\"]}");
	add("{\"term\":\"placer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09416296\"]}");
	add("{\"term\":\"placeseeker\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10456781\"]}");
	add("{\"term\":\"placidity\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04911529\", \"07530408\"]}");
	add("{\"term\":\"placidness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07530408\"]}");
	add("{\"term\":\"placidyl\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03304735\"]}");
	add("{\"term\":\"placket\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03960177\"]}");
	add("{\"term\":\"placoderm\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01482747\"]}");
	add("{\"term\":\"placodermi\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01482578\"]}");
	add("{\"term\":\"placuna\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01965303\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }
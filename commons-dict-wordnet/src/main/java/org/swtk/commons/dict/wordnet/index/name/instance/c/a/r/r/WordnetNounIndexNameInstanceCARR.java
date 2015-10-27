package org.swtk.commons.dict.wordnet.index.name.instance.c.a.r.r;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceCARR {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"carrack\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02971669\"]}");
	add("{\"term\":\"carrageen\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01417274\"]}");
	add("{\"term\":\"carrageenan\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14825881\"]}");
	add("{\"term\":\"carrageenin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14825881\"]}");
	add("{\"term\":\"carragheen\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01417274\"]}");
	add("{\"term\":\"carrefour\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03586294\"]}");
	add("{\"term\":\"carrel\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02971792\", \"10903440\"]}");
	add("{\"term\":\"carrell\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02971792\"]}");
	add("{\"term\":\"carrere\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10903623\"]}");
	add("{\"term\":\"carriage\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"02769539\", \"02972469\", \"05009987\", \"02971932\", \"03901563\"]}");
	add("{\"term\":\"carriageway\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02972782\"]}");
	add("{\"term\":\"carrier\", \"synsetCount\":11, \"upperType\":\"NOUN\", \"ids\":[\"01316636\", \"02973345\", \"09916802\", \"09917055\", \"10302734\", \"11521648\", \"08074469\", \"14751332\", \"02690031\", \"02973559\", \"09917148\"]}");
	add("{\"term\":\"carrion\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01761536\"]}");
	add("{\"term\":\"carrizo\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12151454\"]}");
	add("{\"term\":\"carroll\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10903813\"]}");
	add("{\"term\":\"carrot\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"01222212\", \"07746183\", \"12958148\", \"12958438\"]}");
	add("{\"term\":\"carrottop\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10533416\"]}");
	add("{\"term\":\"carrousel\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02969645\", \"02969824\"]}");
	add("{\"term\":\"carry\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00319561\"]}");
	add("{\"term\":\"carryall\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02973867\"]}");
	add("{\"term\":\"carrycot\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02973993\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }
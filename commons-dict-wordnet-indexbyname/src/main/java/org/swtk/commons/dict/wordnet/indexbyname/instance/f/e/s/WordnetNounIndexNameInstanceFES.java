package org.swtk.commons.dict.wordnet.indexbyname.instance.f.e.s;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceFES {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"fes\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08992415\"]}");
	add("{\"term\":\"fescue\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12142127\"]}");
	add("{\"term\":\"fescue grass\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12142127\"]}");
	add("{\"term\":\"fess\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03335065\"]}");
	add("{\"term\":\"fesse\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03335065\"]}");
	add("{\"term\":\"fester\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14207736\"]}");
	add("{\"term\":\"festering\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05424816\", \"13501092\"]}");
	add("{\"term\":\"festination\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14336581\"]}");
	add("{\"term\":\"festival\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00518784\", \"15187435\"]}");
	add("{\"term\":\"festival of lights\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15223868\"]}");
	add("{\"term\":\"festivity\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00428985\"]}");
	add("{\"term\":\"festoon\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"03335219\", \"03335386\", \"03335610\"]}");
	add("{\"term\":\"festoonery\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03335219\"]}");
	add("{\"term\":\"festschrift\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06418508\"]}");
	add("{\"term\":\"festuca\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12141922\"]}");
	add("{\"term\":\"festuca elatior\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12142127\"]}");
	add("{\"term\":\"festuca ovina\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12142352\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }
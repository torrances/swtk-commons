package org.swtk.commons.dict.wordnet.indexbyname.instance.t.o.n;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceTON {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"ton\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"13743492\", \"13743634\"]}");
	add("{\"term\":\"tonality\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06876801\"]}");
	add("{\"term\":\"tone\", \"synsetCount\":10, \"upperType\":\"NOUN\", \"ids\":[\"05218719\", \"06872106\", \"14568274\", \"05727552\", \"06878395\", \"04966407\", \"14549784\", \"04994869\", \"04994132\", \"07096765\"]}");
	add("{\"term\":\"toner\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"04457911\", \"15100434\", \"15100578\"]}");
	add("{\"term\":\"tonga\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07008689\", \"09059608\"]}");
	add("{\"term\":\"tongan\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06950967\", \"09769741\"]}");
	add("{\"term\":\"tongs\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04458020\"]}");
	add("{\"term\":\"tongue\", \"synsetCount\":8, \"upperType\":\"NOUN\", \"ids\":[\"03041213\", \"04458265\", \"07668604\", \"09465499\", \"07096390\", \"13941420\", \"06916947\", \"05308571\"]}");
	add("{\"term\":\"tonguefish\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02666115\"]}");
	add("{\"term\":\"tongueflower\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12083712\"]}");
	add("{\"term\":\"tonic\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"04458744\", \"06870776\", \"07943752\", \"07945412\"]}");
	add("{\"term\":\"tonicity\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14568274\"]}");
	add("{\"term\":\"tonight\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15287856\"]}");
	add("{\"term\":\"tonnage\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13338291\"]}");
	add("{\"term\":\"tonne\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13747698\"]}");
	add("{\"term\":\"tonocard\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04451052\"]}");
	add("{\"term\":\"tonometer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04458907\"]}");
	add("{\"term\":\"tonometry\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01119017\"]}");
	add("{\"term\":\"tons\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13799721\"]}");
	add("{\"term\":\"tonsil\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05316575\"]}");
	add("{\"term\":\"tonsilla\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05316575\"]}");
	add("{\"term\":\"tonsillectomy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00689570\"]}");
	add("{\"term\":\"tonsillitis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14380656\"]}");
	add("{\"term\":\"tonsure\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00255789\", \"05547350\"]}");
	add("{\"term\":\"tontine\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"13316383\", \"13368765\"]}");
	add("{\"term\":\"tonus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14568274\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }
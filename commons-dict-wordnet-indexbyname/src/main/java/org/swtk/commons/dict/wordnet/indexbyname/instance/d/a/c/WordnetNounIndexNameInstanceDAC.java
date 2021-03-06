package org.swtk.commons.dict.wordnet.indexbyname.instance.d.a.c;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceDAC {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"dacca\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08868218\"]}");
	add("{\"term\":\"dace\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01443758\"]}");
	add("{\"term\":\"dacelo\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01830908\"]}");
	add("{\"term\":\"dacelo gigas\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01831197\"]}");
	add("{\"term\":\"dacha\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03162852\"]}");
	add("{\"term\":\"dachau\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03162925\"]}");
	add("{\"term\":\"dachshund\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02091884\"]}");
	add("{\"term\":\"dachsie\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02091884\"]}");
	add("{\"term\":\"dacite\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14751002\"]}");
	add("{\"term\":\"dacninae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01541416\"]}");
	add("{\"term\":\"dacoit\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10007465\"]}");
	add("{\"term\":\"dacoity\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00784581\"]}");
	add("{\"term\":\"dacridium laxifolius\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11677222\"]}");
	add("{\"term\":\"dacron\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03163080\"]}");
	add("{\"term\":\"dacrycarpus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11674179\"]}");
	add("{\"term\":\"dacrycarpus dacrydioides\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11674355\"]}");
	add("{\"term\":\"dacrydium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11674575\"]}");
	add("{\"term\":\"dacrydium bidwilli\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11676043\"]}");
	add("{\"term\":\"dacrydium colensoi\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11674889\"]}");
	add("{\"term\":\"dacrydium cupressinum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11674744\"]}");
	add("{\"term\":\"dacrydium franklinii\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11676574\"]}");
	add("{\"term\":\"dacrymyces\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13083628\"]}");
	add("{\"term\":\"dacrymycetaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13083390\"]}");
	add("{\"term\":\"dacryocyst\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05339536\"]}");
	add("{\"term\":\"dacryocystitis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14365174\"]}");
	add("{\"term\":\"dacryon\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05239675\"]}");
	add("{\"term\":\"dactyl\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05573730\", \"07109814\"]}");
	add("{\"term\":\"dactylis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12136784\"]}");
	add("{\"term\":\"dactylis glomerata\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12136946\"]}");
	add("{\"term\":\"dactyloctenium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12137100\"]}");
	add("{\"term\":\"dactyloctenium aegypticum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12137251\"]}");
	add("{\"term\":\"dactylomegaly\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14390654\"]}");
	add("{\"term\":\"dactylopiidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02252647\"]}");
	add("{\"term\":\"dactylopius\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02252785\"]}");
	add("{\"term\":\"dactylopius coccus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02252932\"]}");
	add("{\"term\":\"dactylopteridae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02654476\"]}");
	add("{\"term\":\"dactylopterus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02654635\"]}");
	add("{\"term\":\"dactylorhiza\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12078930\"]}");
	add("{\"term\":\"dactylorhiza fuchsii\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12079323\"]}");
	add("{\"term\":\"dactylorhiza maculata fuchsii\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12079323\"]}");
	add("{\"term\":\"dactyloscopidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02614676\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }
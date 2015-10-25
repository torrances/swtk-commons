package org.swtk.commons.dict.wiktionary.generated.t.a.u;  import java.util.Collection; import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryTAU000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("taupe", "{\"term\":\"taupe\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"Latin\"], \"text\":\"{{borrowing|fr|taupe|lang\u003den}}, from Latin {{m|la|talpa||mole}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A dark brownish-grey colour, the colour of moleskin\", \"priority\":1}]}, \"synonyms\":{}}");

	add("taurokathapsia", "{\"term\":\"taurokathapsia\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"ancient greek (to 1453)\"], \"text\":\"From Revived Ancient greek (to 1453) \u0027ταυροκαθάψια\u0027 variant of \u0027ταυροκάθαψις\u0027 from \u0027ταῦρος\u0027 (bull) + \u0027κάθαψις\u0027 Apparently coined by {{w|Arthur Evans}}, the excavator of Knossos, in ca. 1910.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Bull-leaping, as depicted in Bronze Age art, especially from Minoan Crete\", \"priority\":1}]}, \"synonyms\":{}}");

	add("taurophobia", "{\"term\":\"taurophobia\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Fear of bulls\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"Opposition to bullfighting\", \"priority\":2}]}, \"synonyms\":{}}");

	add("tautness", "{\"term\":\"tautness\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|taut|ness|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"the property of being taut\", \"priority\":1}]}, \"synonyms\":{}}");

	add("tautology", "{\"term\":\"tautology\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"ancient greek (to 1453)\"], \"text\":\"From \u0027tautologia\u0027 () from Ancient greek (to 1453) \u0027ταυτολογία\u0027 from \u0027ταὐτός|lang\u003dgrc\u0027 () + \u0027λόγος|lang\u003dgrc\u0027 ()\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Redundant use of words\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"It is \u0027\u0027tautology\u0027\u0027 to say, \u0026quot;Forward Planning\u0026quot\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"An expression that features tautology\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"The expression \u0026quot;raze to the ground\u0026quot; is a tautology, since the word \u0026quot;raze\u0026quot; includes the notion \u0026quot;to the ground\u0026quot\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"1946\u0027\u0027, Bertrand Russell, \u0027History of Western Philosophy\", \"priority\":5},{\"upperType\":\"NOUN\", \"text\":\"Pure mathematics consists of \u0027\u0027tautologies\u0027\u0027, analogous to ‘men are men’, but usually more complicated\", \"priority\":6},{\"upperType\":\"NOUN\", \"text\":\"A statement that is true for all values of its variables\", \"priority\":7},{\"upperType\":\"NOUN\", \"text\":\"Given a Boolean A, \u0026quot;A OR (NOT A)\u0026quot; is a \u0027\u0027tautology\", \"priority\":8},{\"upperType\":\"NOUN\", \"text\":\"A logical statement which is neither a \u0027\u0027tautology\u0027\u0027 nor a contradiction is a contingency\", \"priority\":9},{\"upperType\":\"NOUN\", \"text\":\"A \u0027\u0027tautology\u0027\u0027 can be verified by constructing a truth tree for its negation: if all of the leaf nodes of such truth tree end in X\u0027s, then the original (pre-negated) formula is a \u0027\u0027tautology\", \"priority\":10}]}, \"synonyms\":{}}");

	add("tautomer", "{\"term\":\"tautomer\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{confix|tauto|mer|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Any of the multiple forms of a tautomeric compound\", \"priority\":1}]}, \"synonyms\":{}}");

	add("tautonym", "{\"term\":\"tautonym\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{confix|taut|onym|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A binomial name consisting of the same word twice, such as \u0027Bison bison\", \"priority\":1}]}, \"synonyms\":{}}");

	add("tautonymy", "{\"term\":\"tautonymy\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The use of a binomial name consisting of the same word twice, such as \u0027Bison bison\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	}  	public static boolean has(String term) { 		return null != get(term); 	}  	public static Collection<String> terms() { 		return map.keySet(); 	} }
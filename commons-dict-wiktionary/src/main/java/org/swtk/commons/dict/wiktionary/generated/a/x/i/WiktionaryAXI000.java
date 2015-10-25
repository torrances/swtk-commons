package org.swtk.commons.dict.wiktionary.generated.a.x.i;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryAXI000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("axil", "{\"term\":\"axil\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"Latin\"], \"text\":\"Latin \u0027axilla\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The angle or point of divergence between the upper side of a branch, leaf, or petiole, and the stem or branch from which it springs\", \"priority\":1}]}, \"synonyms\":{}}");

	add("axinomancy", "{\"term\":\"axinomancy\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"ancient greek (to 1453)\", \"Latin\"], \"text\":\"Latin \u0027axinomantia\u0027, from Ancient greek (to 1453) \u0027ἀξινομαντεία\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A species of divination, by means of an ax or hatchet. Including\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"placing an agate stone, piece of jet, or some other precious or semi-precious stone upon the axe-head and heating the metal, the movement of the agate then being interpreted\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"interpreting their movement when balanced on a post\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"Divination by saws. Almost certainly an error, there is only one citation of its use, and those who copied it\", \"priority\":4}]}, \"synonyms\":{}}");

	add("axiomata", "{\"term\":\"axiomata\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"1882\u0027\u0027: Alfred William Benn, \u0027The Greek Philosophers\u0027, p. 37\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"We do, indeed, find mention made of \u0027\u0027axiomata\u0027\u0027 or general propositions to a greater extent than in the Organon, but they are never clearly distinguished\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"1947\u0027\u0027: Theodore van Schelven, \u0027An Introduction to Definitive Philosophy and Basic Psychology\u0027, p. 3\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"These pairs of extra-monads contain 32 ideas; so there may be 16 groups of \u0027\u0027axiomata\u0027\u0027 in the theory of numbers, and 16 groups of \u0027\u0027axiomata\u0027\u0027 in common or indefinite\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"1985\u0027\u0027: William Kneale \u0026amp; Martha Kneale, \u0027The Development of Logic\u0027, p. 5\", \"priority\":5},{\"upperType\":\"NOUN\", \"text\":\"The truth of other \u0027\u0027axiomata\u0027\u0027 would have to be defined in terms of the truth of these\", \"priority\":6},{\"upperType\":\"NOUN\", \"text\":\"1987\u0027\u0027: Paul Guyer, \u0027Kant and the Claims of Knowledge\u0027, p. 6\", \"priority\":7},{\"upperType\":\"NOUN\", \"text\":\"Kant refers to these principles as “axioms” (\u0027\u0027axiomata\", \"priority\":8},{\"upperType\":\"NOUN\", \"text\":\"2003\u0027\u0027: J. J. Van Der Leeuw, \u0027Conquest of Illusion\u0027, p. 5\", \"priority\":9},{\"upperType\":\"NOUN\", \"text\":\"These \u0027\u0027axiomata\u0027\u0027 themselves are self-evident to us; we do not feel that they need proving and recognize them intuitively\", \"priority\":10},{\"upperType\":\"NOUN\", \"text\":\"2003\u0027\u0027: Brad Inwood, \u0027The Cambridge Companion to the Stoics\u0027, p. 26\", \"priority\":11},{\"upperType\":\"NOUN\", \"text\":\"The only text (S. E. \u0027M\u0027 VII 246 \u003d SVF 2.65 \u003d LS 3oF) that seems to offer evidence that individual impressions might be correlated with multiple \u0027\u0027axiomata\u0027\u0027 is…Category:English plurals ending in \u0026quot;-a\u0026quot\", \"priority\":12}]}, \"synonyms\":{}}");

	add("axiomaticity", "{\"term\":\"axiomaticity\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|axiomatic|ity|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The characteristic of being axiomatic\", \"priority\":1}]}, \"synonyms\":{}}");

	add("axiomatization", "{\"term\":\"axiomatization\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"From {{suffix|axiomatize|ation|lang\u003den}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The reduction of some system or concept to a set of axioms\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"2012\u0027\u0027, \u0027Turing\u0027s Cathedral\u0027, Penguin 2013, p. 49\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"The \u0027\u0027axiomatization\u0027\u0027 of set theory formed the foundations, mathematically, of everything else\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"The result of establishing a concept within a system of axioms; axiomatic system\", \"priority\":4}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }